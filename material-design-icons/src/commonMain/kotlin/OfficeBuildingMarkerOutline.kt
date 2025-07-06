package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OfficeBuildingMarkerOutline: ImageVector
    get() {
        if (_OfficeBuildingMarkerOutline != null) {
            return _OfficeBuildingMarkerOutline!!
        }
        _OfficeBuildingMarkerOutline = ImageVector.Builder(
            name = "OfficeBuildingMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(17f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(13f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(9f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                moveTo(9f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(14.55f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(11.03f)
                curveTo(19.71f, 11.09f, 20.39f, 11.31f, 21f, 11.63f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                verticalLineTo(23f)
                horizontalLineTo(15.91f)
                curveTo(15.5f, 22.44f, 15f, 21.76f, 14.55f, 21f)
                moveTo(7f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(9f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(22f, 16.5f)
                curveTo(22f, 19.1f, 18.5f, 23f, 18.5f, 23f)
                reflectiveCurveTo(15f, 19.1f, 15f, 16.5f)
                curveTo(15f, 14.6f, 16.6f, 13f, 18.5f, 13f)
                reflectiveCurveTo(22f, 14.6f, 22f, 16.5f)
                moveTo(19.7f, 16.6f)
                curveTo(19.7f, 16f, 19.1f, 15.4f, 18.5f, 15.4f)
                reflectiveCurveTo(17.3f, 15.9f, 17.3f, 16.6f)
                curveTo(17.3f, 17.2f, 17.8f, 17.8f, 18.5f, 17.8f)
                reflectiveCurveTo(19.8f, 17.2f, 19.7f, 16.6f)
                close()
            }
        }.build()

        return _OfficeBuildingMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeBuildingMarkerOutline: ImageVector? = null
