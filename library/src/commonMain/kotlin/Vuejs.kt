package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vuejs: ImageVector
    get() {
        if (_Vuejs != null) {
            return _Vuejs!!
        }
        _Vuejs = ImageVector.Builder(
            name = "Vuejs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(5.5f)
                lineTo(12f, 15f)
                lineTo(18.5f, 3f)
                horizontalLineTo(22f)
                lineTo(12f, 21f)
                lineTo(2f, 3f)
                moveTo(6.5f, 3f)
                horizontalLineTo(9.5f)
                lineTo(12f, 7.58f)
                lineTo(14.5f, 3f)
                horizontalLineTo(17.5f)
                lineTo(12f, 13.08f)
                lineTo(6.5f, 3f)
                close()
            }
        }.build()

        return _Vuejs!!
    }

@Suppress("ObjectPropertyName")
private var _Vuejs: ImageVector? = null
