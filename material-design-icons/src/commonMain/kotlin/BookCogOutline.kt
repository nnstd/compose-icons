package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookCogOutline: ImageVector
    get() {
        if (_BookCogOutline != null) {
            return _BookCogOutline!!
        }
        _BookCogOutline = ImageVector.Builder(
            name = "BookCogOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(12.08f)
                curveTo(12.18f, 20.71f, 12.39f, 21.38f, 12.69f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.11f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(12.08f)
                curveTo(19.67f, 12.03f, 19.34f, 12f, 19f, 12f)
                curveTo(18.66f, 12f, 18.33f, 12.03f, 18f, 12.08f)
                verticalLineTo(4f)
                moveTo(23.8f, 20.4f)
                curveTo(23.9f, 20.4f, 23.9f, 20.5f, 23.8f, 20.6f)
                lineTo(22.8f, 22.3f)
                curveTo(22.7f, 22.4f, 22.6f, 22.4f, 22.5f, 22.4f)
                lineTo(21.3f, 22f)
                curveTo(21f, 22.2f, 20.8f, 22.3f, 20.5f, 22.5f)
                lineTo(20.3f, 23.8f)
                curveTo(20.3f, 23.9f, 20.2f, 24f, 20.1f, 24f)
                horizontalLineTo(18.1f)
                curveTo(18f, 24f, 17.9f, 23.9f, 17.8f, 23.8f)
                lineTo(17.6f, 22.5f)
                curveTo(17.3f, 22.4f, 17f, 22.2f, 16.8f, 22f)
                lineTo(15.6f, 22.5f)
                curveTo(15.5f, 22.5f, 15.4f, 22.5f, 15.3f, 22.4f)
                lineTo(14.3f, 20.7f)
                curveTo(14.2f, 20.6f, 14.3f, 20.5f, 14.4f, 20.4f)
                lineTo(15.5f, 19.6f)
                verticalLineTo(18.6f)
                lineTo(14.4f, 17.8f)
                curveTo(14.3f, 17.7f, 14.3f, 17.6f, 14.3f, 17.5f)
                lineTo(15.3f, 15.8f)
                curveTo(15.4f, 15.7f, 15.5f, 15.7f, 15.6f, 15.7f)
                lineTo(16.8f, 16.2f)
                curveTo(17.1f, 16f, 17.3f, 15.9f, 17.6f, 15.7f)
                lineTo(17.8f, 14.4f)
                curveTo(17.8f, 14.3f, 17.9f, 14.2f, 18.1f, 14.2f)
                horizontalLineTo(20.1f)
                curveTo(20.2f, 14.2f, 20.3f, 14.3f, 20.3f, 14.4f)
                lineTo(20.5f, 15.7f)
                curveTo(20.8f, 15.8f, 21.1f, 16f, 21.4f, 16.2f)
                lineTo(22.6f, 15.7f)
                curveTo(22.7f, 15.7f, 22.9f, 15.7f, 22.9f, 15.8f)
                lineTo(23.9f, 17.5f)
                curveTo(24f, 17.6f, 23.9f, 17.7f, 23.8f, 17.8f)
                lineTo(22.7f, 18.6f)
                verticalLineTo(19.6f)
                lineTo(23.8f, 20.4f)
                moveTo(20.5f, 19f)
                curveTo(20.5f, 18.2f, 19.8f, 17.5f, 19f, 17.5f)
                reflectiveCurveTo(17.5f, 18.2f, 17.5f, 19f)
                reflectiveCurveTo(18.2f, 20.5f, 19f, 20.5f)
                reflectiveCurveTo(20.5f, 19.8f, 20.5f, 19f)
                close()
            }
        }.build()

        return _BookCogOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookCogOutline: ImageVector? = null
