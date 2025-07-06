package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertCircleCheck: ImageVector
    get() {
        if (_AlertCircleCheck != null) {
            return _AlertCircleCheck!!
        }
        _AlertCircleCheck = ImageVector.Builder(
            name = "AlertCircleCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.75f, 22.16f)
                lineTo(16f, 19.16f)
                lineTo(17.16f, 18f)
                lineTo(18.75f, 19.59f)
                lineTo(22.34f, 16f)
                lineTo(23.5f, 17.41f)
                lineTo(18.75f, 22.16f)
                moveTo(13f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(13f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                lineTo(21.91f, 13.31f)
                curveTo(21.31f, 13.11f, 20.67f, 13f, 20f, 13f)
                curveTo(16.69f, 13f, 14f, 15.69f, 14f, 19f)
                curveTo(14f, 19.95f, 14.22f, 20.85f, 14.62f, 21.65f)
                curveTo(13.78f, 21.88f, 12.91f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _AlertCircleCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AlertCircleCheck: ImageVector? = null
