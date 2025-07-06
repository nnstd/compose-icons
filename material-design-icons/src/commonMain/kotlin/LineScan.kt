package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LineScan: ImageVector
    get() {
        if (_LineScan != null) {
            return _LineScan!!
        }
        _LineScan = ImageVector.Builder(
            name = "LineScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(20.5f)
                curveTo(22f, 20.9f, 21.8f, 21.2f, 21.5f, 21.5f)
                curveTo(21.2f, 21.8f, 20.8f, 22f, 20.5f, 22f)
                horizontalLineTo(17f)
                moveTo(7f, 22f)
                horizontalLineTo(3.5f)
                curveTo(3.1f, 22f, 2.8f, 21.8f, 2.5f, 21.5f)
                curveTo(2.2f, 21.2f, 2f, 20.8f, 2f, 20.5f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(17f, 2f)
                horizontalLineTo(20.5f)
                curveTo(20.9f, 2f, 21.2f, 2.2f, 21.5f, 2.5f)
                curveTo(21.8f, 2.8f, 22f, 3.1f, 22f, 3.5f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                moveTo(7f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.1f, 2.2f, 2.8f, 2.5f, 2.5f)
                reflectiveCurveTo(3.1f, 2f, 3.5f, 2f)
                horizontalLineTo(7f)
                moveTo(19f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _LineScan!!
    }

@Suppress("ObjectPropertyName")
private var _LineScan: ImageVector? = null
