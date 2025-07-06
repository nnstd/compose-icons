package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreMarkerOutline: ImageVector
    get() {
        if (_StoreMarkerOutline != null) {
            return _StoreMarkerOutline!!
        }
        _StoreMarkerOutline = ImageVector.Builder(
            name = "StoreMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(14.3f, 12f)
                curveTo(13.5f, 12.96f, 13f, 14.18f, 13f, 15.5f)
                curveTo(13f, 16.64f, 13.43f, 17.86f, 14f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(20.7f, 10.5f)
                curveTo(20.04f, 10.18f, 19.32f, 10f, 18.56f, 10f)
                lineTo(18.36f, 9f)
                horizontalLineTo(5.64f)
                lineTo(5.04f, 12f)
                horizontalLineTo(14.3f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                reflectiveCurveTo(22f, 13.6f, 22f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }.build()

        return _StoreMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreMarkerOutline: ImageVector? = null
