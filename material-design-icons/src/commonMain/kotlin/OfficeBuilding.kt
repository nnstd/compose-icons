package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OfficeBuilding: ImageVector
    get() {
        if (_OfficeBuilding != null) {
            return _OfficeBuilding!!
        }
        _OfficeBuilding = ImageVector.Builder(
            name = "OfficeBuilding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(17.5f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                moveTo(7f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(7f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(7f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                moveTo(15f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _OfficeBuilding!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeBuilding: ImageVector? = null
