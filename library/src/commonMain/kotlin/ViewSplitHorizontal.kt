package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewSplitHorizontal: ImageVector
    get() {
        if (_ViewSplitHorizontal != null) {
            return _ViewSplitHorizontal!!
        }
        _ViewSplitHorizontal = ImageVector.Builder(
            name = "ViewSplitHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(3f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                moveTo(3f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ViewSplitHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ViewSplitHorizontal: ImageVector? = null
