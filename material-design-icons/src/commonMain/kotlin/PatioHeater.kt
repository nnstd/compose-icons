package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PatioHeater: ImageVector
    get() {
        if (_PatioHeater != null) {
            return _PatioHeater!!
        }
        _PatioHeater = ImageVector.Builder(
            name = "PatioHeater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                moveTo(19f, 4f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(5f, 4f)
                horizontalLineTo(19f)
                moveTo(8f, 5f)
                lineTo(8.4f, 6f)
                horizontalLineTo(15.6f)
                lineTo(16f, 5f)
                horizontalLineTo(8f)
                moveTo(10f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                curveTo(10.4f, 15f, 10f, 15.4f, 10f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                curveTo(14f, 15.4f, 13.6f, 15f, 13f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                lineTo(14.4f, 9f)
                horizontalLineTo(9.6f)
                lineTo(10f, 10f)
                moveTo(9.2f, 8f)
                horizontalLineTo(14.8f)
                lineTo(15.2f, 7f)
                horizontalLineTo(8.8f)
                lineTo(9.2f, 8f)
                close()
            }
        }.build()

        return _PatioHeater!!
    }

@Suppress("ObjectPropertyName")
private var _PatioHeater: ImageVector? = null
