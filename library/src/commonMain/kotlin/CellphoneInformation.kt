package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneInformation: ImageVector
    get() {
        if (_CellphoneInformation != null) {
            return _CellphoneInformation!!
        }
        _CellphoneInformation = ImageVector.Builder(
            name = "CellphoneInformation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineTo(21f)
                curveTo(5f, 22.1f, 5.9f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(18.1f, 23f, 19f, 22.1f, 19f, 21f)
                verticalLineTo(3f)
                curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _CellphoneInformation!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneInformation: ImageVector? = null
