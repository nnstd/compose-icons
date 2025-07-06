package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyMinus: ImageVector
    get() {
        if (_KeyMinus != null) {
            return _KeyMinus!!
        }
        _KeyMinus = ImageVector.Builder(
            name = "KeyMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3f)
                curveTo(9.5f, 3f, 11.1f, 4.2f, 11.7f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 10.8f, 9.4f, 12f, 7.5f, 12f)
                curveTo(5f, 12f, 3f, 10f, 3f, 7.5f)
                reflectiveCurveTo(5f, 3f, 7.5f, 3f)
                moveTo(7.5f, 6f)
                curveTo(6.7f, 6f, 6f, 6.7f, 6f, 7.5f)
                reflectiveCurveTo(6.7f, 9f, 7.5f, 9f)
                reflectiveCurveTo(9f, 8.3f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 6f, 7.5f, 6f)
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _KeyMinus!!
    }

@Suppress("ObjectPropertyName")
private var _KeyMinus: ImageVector? = null
