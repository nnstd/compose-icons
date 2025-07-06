package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Raw: ImageVector
    get() {
        if (_Raw != null) {
            return _Raw!!
        }
        _Raw = ImageVector.Builder(
            name = "Raw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 9f)
                curveTo(7.3f, 9f, 8f, 9.7f, 8f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(8f, 12.1f, 7.6f, 12.6f, 7.1f, 12.9f)
                lineTo(8f, 15f)
                horizontalLineTo(6.5f)
                lineTo(5.6f, 13f)
                horizontalLineTo(4.5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                moveTo(6.5f, 11.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                moveTo(10.25f, 9f)
                horizontalLineTo(12.75f)
                lineTo(14.25f, 15f)
                horizontalLineTo(12.75f)
                lineTo(12.38f, 13.5f)
                horizontalLineTo(10.63f)
                lineTo(10.25f, 15f)
                horizontalLineTo(8.75f)
                lineTo(10.25f, 9f)
                moveTo(11f, 12f)
                horizontalLineTo(12f)
                lineTo(11.75f, 11f)
                horizontalLineTo(11.25f)
                lineTo(11f, 12f)
                moveTo(20f, 9f)
                horizontalLineTo(21.5f)
                lineTo(20f, 15f)
                horizontalLineTo(18.5f)
                lineTo(17.74f, 11.96f)
                lineTo(17f, 15f)
                horizontalLineTo(15.5f)
                lineTo(14f, 9f)
                horizontalLineTo(15.5f)
                lineTo(16.24f, 12f)
                lineTo(17f, 9f)
                horizontalLineTo(18.5f)
                lineTo(19.24f, 12f)
                lineTo(20f, 9f)
                close()
            }
        }.build()

        return _Raw!!
    }

@Suppress("ObjectPropertyName")
private var _Raw: ImageVector? = null
