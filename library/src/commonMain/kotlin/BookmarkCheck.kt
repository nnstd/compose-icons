package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkCheck: ImageVector
    get() {
        if (_BookmarkCheck != null) {
            return _BookmarkCheck!!
        }
        _BookmarkCheck = ImageVector.Builder(
            name = "BookmarkCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5f)
                verticalLineTo(21f)
                lineTo(12f, 18f)
                lineTo(5f, 21f)
                verticalLineTo(5f)
                curveTo(5f, 3.89f, 5.9f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                moveTo(11f, 14f)
                lineTo(17.25f, 7.76f)
                lineTo(15.84f, 6.34f)
                lineTo(11f, 11.18f)
                lineTo(8.41f, 8.59f)
                lineTo(7f, 10f)
                lineTo(11f, 14f)
                close()
            }
        }.build()

        return _BookmarkCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkCheck: ImageVector? = null
