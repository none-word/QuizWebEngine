<template>
  <q-btn data-test-id="logoutFromUser" @click="logout" class="accept-button" flat>
    Signout
  </q-btn>
</template>

<script>
import { logout } from "src/mixins/logout";

export default {
  name: "LogoutButtonMain",
  mixins: [logout]
};
</script>

<style scoped></style>
