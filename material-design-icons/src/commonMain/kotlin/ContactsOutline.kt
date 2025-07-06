package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContactsOutline: ImageVector
    get() {
        if (_ContactsOutline != null) {
            return _ContactsOutline!!
        }
        _ContactsOutline = ImageVector.Builder(
            name = "ContactsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(4f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(4f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(4f)
                moveTo(12f, 12f)
                curveTo(13.38f, 12f, 14.5f, 10.88f, 14.5f, 9.5f)
                reflectiveCurveTo(13.38f, 7f, 12f, 7f)
                reflectiveCurveTo(9.5f, 8.12f, 9.5f, 9.5f)
                reflectiveCurveTo(10.62f, 12f, 12f, 12f)
                moveTo(12f, 8.5f)
                curveTo(12.55f, 8.5f, 13f, 8.95f, 13f, 9.5f)
                reflectiveCurveTo(12.55f, 10.5f, 12f, 10.5f)
                reflectiveCurveTo(11f, 10.05f, 11f, 9.5f)
                reflectiveCurveTo(11.45f, 8.5f, 12f, 8.5f)
                moveTo(17f, 16f)
                curveTo(17f, 13.9f, 13.69f, 13f, 12f, 13f)
                reflectiveCurveTo(7f, 13.9f, 7f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                moveTo(8.81f, 15.5f)
                curveTo(9.42f, 15f, 10.84f, 14.5f, 12f, 14.5f)
                curveTo(13.17f, 14.5f, 14.59f, 15f, 15.2f, 15.5f)
                horizontalLineTo(8.81f)
                close()
            }
        }.build()

        return _ContactsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContactsOutline: ImageVector? = null
