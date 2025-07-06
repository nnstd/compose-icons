package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpBoldOutline: ImageVector
    get() {
        if (_ArrowUpBoldOutline != null) {
            return _ArrowUpBoldOutline!!
        }
        _ArrowUpBoldOutline = ImageVector.Builder(
            name = "ArrowUpBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 13f)
                horizontalLineTo(16f)
                moveTo(7f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                lineTo(12f, 6f)
                lineTo(7f, 11f)
                close()
            }
        }.build()

        return _ArrowUpBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpBoldOutline: ImageVector? = null
