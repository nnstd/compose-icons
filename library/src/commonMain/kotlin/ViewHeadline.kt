package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewHeadline: ImageVector
    get() {
        if (_ViewHeadline != null) {
            return _ViewHeadline!!
        }
        _ViewHeadline = ImageVector.Builder(
            name = "ViewHeadline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(4f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(4f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                moveTo(4f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ViewHeadline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewHeadline: ImageVector? = null
