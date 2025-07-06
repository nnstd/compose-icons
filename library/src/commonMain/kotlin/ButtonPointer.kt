package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ButtonPointer: ImageVector
    get() {
        if (_ButtonPointer != null) {
            return _ButtonPointer!!
        }
        _ButtonPointer = ImageVector.Builder(
            name = "ButtonPointer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20.5f)
                curveTo(20f, 21.3f, 19.3f, 22f, 18.5f, 22f)
                horizontalLineTo(13f)
                curveTo(12.6f, 22f, 12.3f, 21.9f, 12f, 21.6f)
                lineTo(8f, 17.4f)
                lineTo(8.7f, 16.6f)
                curveTo(8.9f, 16.4f, 9.2f, 16.3f, 9.5f, 16.3f)
                horizontalLineTo(9.7f)
                lineTo(12f, 18f)
                verticalLineTo(9f)
                curveTo(12f, 8.4f, 12.4f, 8f, 13f, 8f)
                reflectiveCurveTo(14f, 8.4f, 14f, 9f)
                verticalLineTo(13.5f)
                lineTo(15.2f, 13.6f)
                lineTo(19.1f, 15.8f)
                curveTo(19.6f, 16f, 20f, 16.6f, 20f, 17.1f)
                verticalLineTo(20.5f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(12f)
                curveTo(2f, 13.1f, 2.9f, 14f, 4f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                curveTo(21.1f, 14f, 22f, 13.1f, 22f, 12f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _ButtonPointer!!
    }

@Suppress("ObjectPropertyName")
private var _ButtonPointer: ImageVector? = null
