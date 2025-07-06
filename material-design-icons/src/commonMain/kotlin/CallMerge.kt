package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CallMerge: ImageVector
    get() {
        if (_CallMerge != null) {
            return _CallMerge!!
        }
        _CallMerge = ImageVector.Builder(
            name = "CallMerge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20.41f)
                lineTo(18.41f, 19f)
                lineTo(15f, 15.59f)
                lineTo(13.59f, 17f)
                moveTo(7.5f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(13.59f)
                lineTo(5.59f, 19f)
                lineTo(7f, 20.41f)
                lineTo(13f, 14.41f)
                verticalLineTo(8f)
                horizontalLineTo(16.5f)
                lineTo(12f, 3.5f)
            }
        }.build()

        return _CallMerge!!
    }

@Suppress("ObjectPropertyName")
private var _CallMerge: ImageVector? = null
