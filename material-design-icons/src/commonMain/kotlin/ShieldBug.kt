package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldBug: ImageVector
    get() {
        if (_ShieldBug != null) {
            return _ShieldBug!!
        }
        _ShieldBug = ImageVector.Builder(
            name = "ShieldBug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.5f, 17.2f, 21.7f, 12f, 23f)
                curveTo(6.8f, 21.7f, 3f, 16.5f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                moveTo(17f, 10f)
                horizontalLineTo(14.8f)
                curveTo(14.6f, 9.4f, 14.2f, 8.9f, 13.7f, 8.5f)
                lineTo(14.9f, 7.3f)
                lineTo(14.2f, 6.6f)
                lineTo(12.8f, 8f)
                horizontalLineTo(12f)
                curveTo(11.8f, 8f, 11.5f, 8f, 11.3f, 8.1f)
                lineTo(9.9f, 6.6f)
                lineTo(9.1f, 7.4f)
                lineTo(10.3f, 8.6f)
                curveTo(9.8f, 8.9f, 9.4f, 9.4f, 9.2f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(9.2f)
                curveTo(9.6f, 16.2f, 10.7f, 17f, 12f, 17f)
                reflectiveCurveTo(14.4f, 16.2f, 14.8f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                moveTo(11f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ShieldBug!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldBug: ImageVector? = null
