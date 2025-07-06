package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OfficeBuildingPlus: ImageVector
    get() {
        if (_OfficeBuildingPlus != null) {
            return _OfficeBuildingPlus!!
        }
        _OfficeBuildingPlus = ImageVector.Builder(
            name = "OfficeBuildingPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.4f, 21f)
                curveTo(13.2f, 20.4f, 13f, 19.7f, 13f, 19f)
                curveTo(13f, 17.5f, 13.6f, 16.1f, 14.5f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(14.5f)
                curveTo(15.6f, 14f, 16.3f, 13.6f, 17f, 13.3f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(17.5f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(13.4f)
                moveTo(13f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                moveTo(13f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(7f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(7f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(7f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(9f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                moveTo(9f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(9f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _OfficeBuildingPlus!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeBuildingPlus: ImageVector? = null
