package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StairsBox: ImageVector
    get() {
        if (_StairsBox != null) {
            return _StairsBox!!
        }
        _StairsBox = ImageVector.Builder(
            name = "StairsBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(14f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _StairsBox!!
    }

@Suppress("ObjectPropertyName")
private var _StairsBox: ImageVector? = null
