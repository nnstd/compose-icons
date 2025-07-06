package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SprinklerVariant: ImageVector
    get() {
        if (_SprinklerVariant != null) {
            return _SprinklerVariant!!
        }
        _SprinklerVariant = ImageVector.Builder(
            name = "SprinklerVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(4f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(4f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                moveTo(1f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                moveTo(1f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                moveTo(1f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                moveTo(18f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(21f, 10f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(21f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(21f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(18f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                moveTo(10f, 7f)
                horizontalLineTo(10.33f)
                lineTo(11f, 9f)
                horizontalLineTo(13f)
                lineTo(13.67f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _SprinklerVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SprinklerVariant: ImageVector? = null
