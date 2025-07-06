package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EllipseOutline: ImageVector
    get() {
        if (_EllipseOutline != null) {
            return _EllipseOutline!!
        }
        _EllipseOutline = ImageVector.Builder(
            name = "EllipseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(16.41f, 6f, 20f, 8.69f, 20f, 12f)
                curveTo(20f, 15.31f, 16.41f, 18f, 12f, 18f)
                curveTo(7.59f, 18f, 4f, 15.31f, 4f, 12f)
                curveTo(4f, 8.69f, 7.59f, 6f, 12f, 6f)
                moveTo(12f, 4f)
                curveTo(6.5f, 4f, 2f, 7.58f, 2f, 12f)
                curveTo(2f, 16.42f, 6.5f, 20f, 12f, 20f)
                curveTo(17.5f, 20f, 22f, 16.42f, 22f, 12f)
                curveTo(22f, 7.58f, 17.5f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _EllipseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EllipseOutline: ImageVector? = null
