package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphonePlay: ImageVector
    get() {
        if (_CellphonePlay != null) {
            return _CellphonePlay!!
        }
        _CellphonePlay = ImageVector.Builder(
            name = "CellphonePlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveTo(5.89f, 1f, 5f, 1.89f, 5f, 3f)
                verticalLineTo(21f)
                curveTo(5f, 22.1f, 5.9f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(18.1f, 23f, 19f, 22.1f, 19f, 21f)
                verticalLineTo(3f)
                curveTo(19f, 1.89f, 18.1f, 1f, 17f, 1f)
                moveTo(10f, 9f)
                verticalLineTo(15f)
                lineTo(14f, 12f)
                lineTo(10f, 9f)
                close()
            }
        }.build()

        return _CellphonePlay!!
    }

@Suppress("ObjectPropertyName")
private var _CellphonePlay: ImageVector? = null
