package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric10BoxMultipleOutline: ImageVector
    get() {
        if (_Numeric10BoxMultipleOutline != null) {
            return _Numeric10BoxMultipleOutline!!
        }
        _Numeric10BoxMultipleOutline = ImageVector.Builder(
            name = "Numeric10BoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                moveTo(21f, 1f)
                curveTo(22.11f, 1f, 23f, 1.9f, 23f, 3f)
                verticalLineTo(17f)
                curveTo(23f, 18.11f, 22.11f, 19f, 21f, 19f)
                horizontalLineTo(7f)
                curveTo(5.9f, 19f, 5f, 18.11f, 5f, 17f)
                verticalLineTo(3f)
                curveTo(5f, 1.9f, 5.9f, 1f, 7f, 1f)
                horizontalLineTo(21f)
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                curveTo(1.9f, 23f, 1f, 22.11f, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(12f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(18f, 5f)
                horizontalLineTo(16f)
                curveTo(14.9f, 5f, 14f, 5.9f, 14f, 7f)
                verticalLineTo(13f)
                curveTo(14f, 14.11f, 14.9f, 15f, 16f, 15f)
                horizontalLineTo(18f)
                curveTo(19.11f, 15f, 20f, 14.11f, 20f, 13f)
                verticalLineTo(7f)
                curveTo(20f, 5.9f, 19.11f, 5f, 18f, 5f)
                moveTo(18f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Numeric10BoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric10BoxMultipleOutline: ImageVector? = null
