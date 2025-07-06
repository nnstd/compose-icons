package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SubwayAlertVariant: ImageVector
    get() {
        if (_SubwayAlertVariant != null) {
            return _SubwayAlertVariant!!
        }
        _SubwayAlertVariant = ImageVector.Builder(
            name = "SubwayAlertVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(14.5f, 17f)
                curveTo(15.3f, 17f, 16f, 16.3f, 16f, 15.5f)
                curveTo(16f, 14.7f, 15.3f, 14f, 14.5f, 14f)
                reflectiveCurveTo(13f, 14.7f, 13f, 15.5f)
                curveTo(13f, 16.3f, 13.7f, 17f, 14.5f, 17f)
                moveTo(9f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(5.5f, 17f)
                curveTo(6.3f, 17f, 7f, 16.3f, 7f, 15.5f)
                curveTo(7f, 14.7f, 6.3f, 14f, 5.5f, 14f)
                reflectiveCurveTo(4f, 14.7f, 4f, 15.5f)
                curveTo(4f, 16.3f, 4.7f, 17f, 5.5f, 17f)
                moveTo(10f, 2f)
                curveTo(14.4f, 2f, 18f, 2.5f, 18f, 6f)
                verticalLineTo(15.5f)
                curveTo(18f, 17.4f, 16.4f, 19f, 14.5f, 19f)
                lineTo(16f, 20.5f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(20.5f)
                lineTo(5.5f, 19f)
                curveTo(3.6f, 19f, 2f, 17.4f, 2f, 15.5f)
                verticalLineTo(6f)
                curveTo(2f, 2.5f, 5.6f, 2f, 10f, 2f)
                moveTo(20f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(20f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _SubwayAlertVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SubwayAlertVariant: ImageVector? = null
