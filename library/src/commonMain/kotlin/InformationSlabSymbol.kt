package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationSlabSymbol: ImageVector
    get() {
        if (_InformationSlabSymbol != null) {
            return _InformationSlabSymbol!!
        }
        _InformationSlabSymbol = ImageVector.Builder(
            name = "InformationSlabSymbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(14f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _InformationSlabSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _InformationSlabSymbol: ImageVector? = null
