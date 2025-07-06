package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetSplit: ImageVector
    get() {
        if (_SetSplit != null) {
            return _SetSplit!!
        }
        _SetSplit = ImageVector.Builder(
            name = "SetSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(2f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(12f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                lineTo(15f, 12f)
                lineTo(12f, 9f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                moveTo(17f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _SetSplit!!
    }

@Suppress("ObjectPropertyName")
private var _SetSplit: ImageVector? = null
