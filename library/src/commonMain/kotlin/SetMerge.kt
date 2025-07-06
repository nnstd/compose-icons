package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetMerge: ImageVector
    get() {
        if (_SetMerge != null) {
            return _SetMerge!!
        }
        _SetMerge = ImageVector.Builder(
            name = "SetMerge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                moveTo(12f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                lineTo(15f, 12f)
                lineTo(12f, 9f)
                moveTo(17f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(2f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                moveTo(2f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _SetMerge!!
    }

@Suppress("ObjectPropertyName")
private var _SetMerge: ImageVector? = null
