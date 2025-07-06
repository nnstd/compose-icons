package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vuetify: ImageVector
    get() {
        if (_Vuetify != null) {
            return _Vuetify!!
        }
        _Vuetify = ImageVector.Builder(
            name = "Vuetify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.64f)
                lineTo(7.92f, 2f)
                horizontalLineTo(16.08f)
                lineTo(12f, 11.64f)
                moveTo(12f, 21.95f)
                lineTo(3.27f, 4.91f)
                horizontalLineTo(7.84f)
                lineTo(12f, 14.47f)
                lineTo(16.16f, 4.91f)
                horizontalLineTo(20.73f)
                lineTo(12f, 21.95f)
                close()
            }
        }.build()

        return _Vuetify!!
    }

@Suppress("ObjectPropertyName")
private var _Vuetify: ImageVector? = null
