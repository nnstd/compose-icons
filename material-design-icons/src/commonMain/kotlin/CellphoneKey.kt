package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneKey: ImageVector
    get() {
        if (_CellphoneKey != null) {
            return _CellphoneKey!!
        }
        _CellphoneKey = ImageVector.Builder(
            name = "CellphoneKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 1f)
                curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(5f, 22.1f, 5.9f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(18.1f, 23f, 19f, 22.1f, 19f, 21f)
                verticalLineTo(3f)
                curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                horizontalLineTo(7f)
                moveTo(6f, 9f)
                curveTo(4.3f, 9f, 3f, 10.3f, 3f, 12f)
                reflectiveCurveTo(4.3f, 15f, 6f, 15f)
                curveTo(7.3f, 15f, 8.4f, 14.2f, 8.8f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(8.8f)
                curveTo(8.4f, 9.8f, 7.3f, 9f, 6f, 9f)
                moveTo(6f, 11f)
                curveTo(6.6f, 11f, 7f, 11.4f, 7f, 12f)
                reflectiveCurveTo(6.6f, 13f, 6f, 13f)
                reflectiveCurveTo(5f, 12.6f, 5f, 12f)
                reflectiveCurveTo(5.4f, 11f, 6f, 11f)
                close()
            }
        }.build()

        return _CellphoneKey!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneKey: ImageVector? = null
