package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewSplitVertical: ImageVector
    get() {
        if (_ViewSplitVertical != null) {
            return _ViewSplitVertical!!
        }
        _ViewSplitVertical = ImageVector.Builder(
            name = "ViewSplitVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(3f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(3f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                moveTo(3f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(3f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ViewSplitVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ViewSplitVertical: ImageVector? = null
