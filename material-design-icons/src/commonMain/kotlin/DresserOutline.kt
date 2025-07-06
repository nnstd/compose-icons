package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DresserOutline: ImageVector
    get() {
        if (_DresserOutline != null) {
            return _DresserOutline!!
        }
        _DresserOutline = ImageVector.Builder(
            name = "DresserOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.11f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(10f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                moveTo(4f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                moveTo(10f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                moveTo(4f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(10f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _DresserOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DresserOutline: ImageVector? = null
