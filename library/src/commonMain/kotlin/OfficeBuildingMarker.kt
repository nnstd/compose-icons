package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OfficeBuildingMarker: ImageVector
    get() {
        if (_OfficeBuildingMarker != null) {
            return _OfficeBuildingMarker!!
        }
        _OfficeBuildingMarker = ImageVector.Builder(
            name = "OfficeBuildingMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.19f, 21f)
                curveTo(14.12f, 19.43f, 13f, 17.36f, 13f, 15.5f)
                curveTo(13f, 13.67f, 13.96f, 12f, 15.4f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(10.23f)
                curveTo(17.5f, 10.09f, 18f, 10f, 18.5f, 10f)
                curveTo(18.67f, 10f, 18.84f, 10f, 19f, 10.03f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17.5f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15.19f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                moveTo(9f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(9f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(11f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.61f, 15f, 15.5f)
                curveTo(15f, 18.11f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.11f, 22f, 15.5f)
                curveTo(22f, 13.61f, 20.4f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.81f)
                curveTo(17.8f, 16.81f, 17.3f, 16.21f, 17.3f, 15.61f)
                curveTo(17.3f, 14.91f, 17.9f, 14.41f, 18.5f, 14.41f)
                reflectiveCurveTo(19.7f, 15f, 19.7f, 15.61f)
                curveTo(19.8f, 16.21f, 19.2f, 16.81f, 18.5f, 16.81f)
                close()
            }
        }.build()

        return _OfficeBuildingMarker!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeBuildingMarker: ImageVector? = null
