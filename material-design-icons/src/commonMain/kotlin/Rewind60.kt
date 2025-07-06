package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rewind60: ImageVector
    get() {
        if (_Rewind60 != null) {
            return _Rewind60!!
        }
        _Rewind60 = ImageVector.Builder(
            name = "Rewind60",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                verticalLineTo(20f)
                curveTo(19f, 21.1f, 18.1f, 22f, 17f, 22f)
                horizontalLineTo(15f)
                curveTo(13.9f, 22f, 13f, 21.1f, 13f, 20f)
                verticalLineTo(14f)
                curveTo(13f, 12.9f, 13.9f, 12f, 15f, 12f)
                horizontalLineTo(17f)
                curveTo(18.1f, 12f, 19f, 12.9f, 19f, 14f)
                moveTo(15f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                moveTo(12.5f, 3f)
                curveTo(17.1f, 3f, 21.1f, 6f, 22.5f, 10.2f)
                lineTo(20.1f, 11f)
                curveTo(19f, 7.8f, 16f, 5.5f, 12.5f, 5.5f)
                curveTo(10.5f, 5.5f, 8.8f, 6.2f, 7.4f, 7.4f)
                lineTo(10f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                lineTo(5.6f, 5.6f)
                curveTo(7.4f, 4f, 9.9f, 3f, 12.5f, 3f)
                moveTo(7f, 12f)
                curveTo(5.9f, 12f, 5f, 12.9f, 5f, 14f)
                verticalLineTo(20f)
                curveTo(5f, 21.1f, 5.9f, 22f, 7f, 22f)
                horizontalLineTo(9f)
                curveTo(10.1f, 22f, 11f, 21.1f, 11f, 20f)
                verticalLineTo(18f)
                curveTo(11f, 16.9f, 10.1f, 16f, 9f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                moveTo(7f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Rewind60!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind60: ImageVector? = null
