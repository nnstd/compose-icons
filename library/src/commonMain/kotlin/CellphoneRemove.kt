package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneRemove: ImageVector
    get() {
        if (_CellphoneRemove != null) {
            return _CellphoneRemove!!
        }
        _CellphoneRemove = ImageVector.Builder(
            name = "CellphoneRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                moveTo(14.54f, 23f)
                horizontalLineTo(7f)
                curveTo(5.9f, 23f, 5f, 22.11f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 1.89f, 5.89f, 1f, 7f, 1f)
                horizontalLineTo(17f)
                curveTo(18.1f, 1f, 19f, 1.89f, 19f, 3f)
                verticalLineTo(13f)
                curveTo(18.3f, 13f, 17.63f, 13.13f, 17f, 13.35f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                curveTo(13f, 20.54f, 13.58f, 21.94f, 14.54f, 23f)
                close()
            }
        }.build()

        return _CellphoneRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneRemove: ImageVector? = null
