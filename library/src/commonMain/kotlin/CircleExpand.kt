package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleExpand: ImageVector
    get() {
        if (_CircleExpand != null) {
            return _CircleExpand!!
        }
        _CircleExpand = ImageVector.Builder(
            name = "CircleExpand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                lineTo(20f, 8f)
                verticalLineTo(4f)
                moveTo(20f, 16f)
                lineTo(16f, 20f)
                horizontalLineTo(20f)
                moveTo(8f, 20f)
                lineTo(4f, 16f)
                verticalLineTo(20f)
                moveTo(4f, 8f)
                lineTo(8f, 4f)
                horizontalLineTo(4f)
                moveTo(16.95f, 7.05f)
                curveTo(14.22f, 4.32f, 9.78f, 4.32f, 7.05f, 7.05f)
                curveTo(4.32f, 9.78f, 4.32f, 14.22f, 7.05f, 16.95f)
                curveTo(9.78f, 19.68f, 14.22f, 19.68f, 16.95f, 16.95f)
                curveTo(19.68f, 14.22f, 19.68f, 9.79f, 16.95f, 7.05f)
                moveTo(15.85f, 15.85f)
                curveTo(13.72f, 18f, 10.28f, 18f, 8.15f, 15.85f)
                curveTo(6f, 13.72f, 6f, 10.28f, 8.15f, 8.15f)
                curveTo(10.28f, 6f, 13.72f, 6f, 15.85f, 8.15f)
                curveTo(18f, 10.28f, 18f, 13.72f, 15.85f, 15.85f)
                close()
            }
        }.build()

        return _CircleExpand!!
    }

@Suppress("ObjectPropertyName")
private var _CircleExpand: ImageVector? = null
