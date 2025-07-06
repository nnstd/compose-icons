package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OfficeBuildingOutline: ImageVector
    get() {
        if (_OfficeBuildingOutline != null) {
            return _OfficeBuildingOutline!!
        }
        _OfficeBuildingOutline = ImageVector.Builder(
            name = "OfficeBuildingOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(15f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(7f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(7f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(15f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(7f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                moveTo(15f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                moveTo(7f, 19f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(21f, 1f)
                horizontalLineTo(3f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _OfficeBuildingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeBuildingOutline: ImageVector? = null
