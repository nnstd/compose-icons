package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sort: ImageVector
    get() {
        if (_Sort != null) {
            return _Sort!!
        }
        _Sort = ImageVector.Builder(
            name = "Sort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 21f)
                lineTo(14f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                lineTo(18f, 3f)
                lineTo(22f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                moveTo(2f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                moveTo(2f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(2f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Sort!!
    }

@Suppress("ObjectPropertyName")
private var _Sort: ImageVector? = null
