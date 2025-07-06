package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationSymbol: ImageVector
    get() {
        if (_InformationSymbol != null) {
            return _InformationSymbol!!
        }
        _InformationSymbol = ImageVector.Builder(
            name = "InformationSymbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _InformationSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _InformationSymbol: ImageVector? = null
