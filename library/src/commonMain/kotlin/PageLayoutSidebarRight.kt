package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PageLayoutSidebarRight: ImageVector
    get() {
        if (_PageLayoutSidebarRight != null) {
            return _PageLayoutSidebarRight!!
        }
        _PageLayoutSidebarRight = ImageVector.Builder(
            name = "PageLayoutSidebarRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                moveTo(14f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _PageLayoutSidebarRight!!
    }

@Suppress("ObjectPropertyName")
private var _PageLayoutSidebarRight: ImageVector? = null
