package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SprinklerFire: ImageVector
    get() {
        if (_SprinklerFire != null) {
            return _SprinklerFire!!
        }
        _SprinklerFire = ImageVector.Builder(
            name = "SprinklerFire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                verticalLineTo(23f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                moveTo(11f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                moveTo(7f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(11f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(15f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                moveTo(11f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                moveTo(15f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                moveTo(19f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(21f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                lineTo(14f, 10f)
                verticalLineTo(7.2f)
                lineTo(16f, 5.2f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(5.2f)
                lineTo(10f, 7.2f)
                verticalLineTo(10f)
                lineTo(6f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(1f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _SprinklerFire!!
    }

@Suppress("ObjectPropertyName")
private var _SprinklerFire: ImageVector? = null
