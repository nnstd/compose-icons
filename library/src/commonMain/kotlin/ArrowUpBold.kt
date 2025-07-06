package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpBold: ImageVector
    get() {
        if (_ArrowUpBold != null) {
            return _ArrowUpBold!!
        }
        _ArrowUpBold = ImageVector.Builder(
            name = "ArrowUpBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(4.16f)
                lineTo(12f, 4.16f)
                lineTo(19.84f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ArrowUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpBold: ImageVector? = null
