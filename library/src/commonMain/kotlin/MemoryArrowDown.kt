package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MemoryArrowDown: ImageVector
    get() {
        if (_MemoryArrowDown != null) {
            return _MemoryArrowDown!!
        }
        _MemoryArrowDown = ImageVector.Builder(
            name = "MemoryArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                lineTo(18f, 22f)
                lineTo(21f, 19f)
                horizontalLineTo(19f)
                moveTo(12.1f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                curveTo(5.9f, 19f, 5f, 18.1f, 5f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 5.9f, 5f, 7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(12.1f)
                curveTo(18.7f, 12f, 18.3f, 12f, 18f, 12f)
                reflectiveCurveTo(17.3f, 12f, 17f, 12.1f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(12.1f)
                curveTo(12f, 17.3f, 12f, 17.7f, 12f, 18f)
                reflectiveCurveTo(12f, 18.7f, 12.1f, 19f)
                moveTo(9f, 15f)
                horizontalLineTo(12.8f)
                curveTo(13.3f, 14.1f, 14.1f, 13.3f, 15f, 12.8f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _MemoryArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _MemoryArrowDown: ImageVector? = null
