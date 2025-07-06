package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrangeBringToFront: ImageVector
    get() {
        if (_ArrangeBringToFront != null) {
            return _ArrangeBringToFront!!
        }
        _ArrangeBringToFront = ImageVector.Builder(
            name = "ArrangeBringToFront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(22f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _ArrangeBringToFront!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeBringToFront: ImageVector? = null
