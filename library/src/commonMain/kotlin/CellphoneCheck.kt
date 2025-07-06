package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneCheck: ImageVector
    get() {
        if (_CellphoneCheck != null) {
            return _CellphoneCheck!!
        }
        _CellphoneCheck = ImageVector.Builder(
            name = "CellphoneCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(17.75f, 22.16f)
                lineTo(15f, 19.16f)
                lineTo(16.16f, 18f)
                lineTo(17.75f, 19.59f)
                lineTo(21.34f, 16f)
                lineTo(22.5f, 17.41f)
                lineTo(17.75f, 22.16f)
            }
        }.build()

        return _CellphoneCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneCheck: ImageVector? = null
