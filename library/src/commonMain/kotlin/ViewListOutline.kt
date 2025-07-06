package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewListOutline: ImageVector
    get() {
        if (_ViewListOutline != null) {
            return _ViewListOutline!!
        }
        _ViewListOutline = ImageVector.Builder(
            name = "ViewListOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(7f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(5f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                moveTo(5f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(18f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                moveTo(18f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(18f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _ViewListOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewListOutline: ImageVector? = null
