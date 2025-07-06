package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PageLayoutHeaderFooter: ImageVector
    get() {
        if (_PageLayoutHeaderFooter != null) {
            return _PageLayoutHeaderFooter!!
        }
        _PageLayoutHeaderFooter = ImageVector.Builder(
            name = "PageLayoutHeaderFooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _PageLayoutHeaderFooter!!
    }

@Suppress("ObjectPropertyName")
private var _PageLayoutHeaderFooter: ImageVector? = null
