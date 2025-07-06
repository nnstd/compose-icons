package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkOffOutline: ImageVector
    get() {
        if (_BookmarkOffOutline != null) {
            return _BookmarkOffOutline!!
        }
        _BookmarkOffOutline = ImageVector.Builder(
            name = "BookmarkOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.28f, 4f)
                lineTo(2f, 5.27f)
                lineTo(5f, 8.27f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(16.78f, 20.05f)
                lineTo(18.73f, 22f)
                lineTo(20f, 20.72f)
                lineTo(3.28f, 4f)
                moveTo(7f, 18f)
                verticalLineTo(10.27f)
                lineTo(13f, 16.25f)
                lineTo(12f, 15.82f)
                lineTo(7f, 18f)
                moveTo(7f, 5.16f)
                lineTo(5.5f, 3.67f)
                curveTo(5.88f, 3.26f, 6.41f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(17.16f)
                lineTo(17f, 15.16f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(5.16f)
                close()
            }
        }.build()

        return _BookmarkOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkOffOutline: ImageVector? = null
