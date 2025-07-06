package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusOutline: ImageVector
    get() {
        if (_PlusOutline != null) {
            return _PlusOutline!!
        }
        _PlusOutline = ImageVector.Builder(
            name = "PlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(11f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _PlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlusOutline: ImageVector? = null
