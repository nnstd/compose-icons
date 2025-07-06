package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RefreshAuto: ImageVector
    get() {
        if (_RefreshAuto != null) {
            return _RefreshAuto!!
        }
        _RefreshAuto = ImageVector.Builder(
            name = "RefreshAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.68f, 6f)
                horizontalLineTo(11.32f)
                lineTo(7f, 16f)
                horizontalLineTo(9f)
                lineTo(9.73f, 14f)
                horizontalLineTo(14.27f)
                lineTo(15f, 16f)
                horizontalLineTo(17f)
                lineTo(12.68f, 6f)
                moveTo(10.3f, 12.5f)
                lineTo(12f, 8f)
                lineTo(13.7f, 12.5f)
                horizontalLineTo(10.3f)
                moveTo(17.4f, 20.4f)
                lineTo(19f, 22f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                lineTo(16f, 19f)
                curveTo(18.39f, 17.61f, 20f, 14.95f, 20f, 12f)
                curveTo(20f, 7.59f, 16.41f, 4f, 12f, 4f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                curveTo(4f, 14.95f, 5.61f, 17.53f, 8f, 18.92f)
                verticalLineTo(21.16f)
                curveTo(4.47f, 19.61f, 2f, 16.1f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                curveTo(22f, 15.53f, 20.17f, 18.62f, 17.4f, 20.4f)
                close()
            }
        }.build()

        return _RefreshAuto!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshAuto: ImageVector? = null
