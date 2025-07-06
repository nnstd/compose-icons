package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSupervisorCircle: ImageVector
    get() {
        if (_AccountSupervisorCircle != null) {
            return _AccountSupervisorCircle!!
        }
        _AccountSupervisorCircle = ImageVector.Builder(
            name = "AccountSupervisorCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(15.6f, 8.34f)
                curveTo(16.67f, 8.34f, 17.53f, 9.2f, 17.53f, 10.27f)
                curveTo(17.53f, 11.34f, 16.67f, 12.2f, 15.6f, 12.2f)
                arcTo(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.67f, 10.27f)
                curveTo(13.66f, 9.2f, 14.53f, 8.34f, 15.6f, 8.34f)
                moveTo(9.6f, 6.76f)
                curveTo(10.9f, 6.76f, 11.96f, 7.82f, 11.96f, 9.12f)
                curveTo(11.96f, 10.42f, 10.9f, 11.5f, 9.6f, 11.5f)
                curveTo(8.3f, 11.5f, 7.24f, 10.42f, 7.24f, 9.12f)
                curveTo(7.24f, 7.81f, 8.29f, 6.76f, 9.6f, 6.76f)
                moveTo(9.6f, 15.89f)
                verticalLineTo(19.64f)
                curveTo(7.2f, 18.89f, 5.3f, 17.04f, 4.46f, 14.68f)
                curveTo(5.5f, 13.56f, 8.13f, 13f, 9.6f, 13f)
                curveTo(10.13f, 13f, 10.8f, 13.07f, 11.5f, 13.21f)
                curveTo(9.86f, 14.08f, 9.6f, 15.23f, 9.6f, 15.89f)
                moveTo(12f, 20f)
                curveTo(11.72f, 20f, 11.46f, 20f, 11.2f, 19.96f)
                verticalLineTo(15.89f)
                curveTo(11.2f, 14.47f, 14.14f, 13.76f, 15.6f, 13.76f)
                curveTo(16.67f, 13.76f, 18.5f, 14.15f, 19.44f, 14.91f)
                curveTo(18.27f, 17.88f, 15.38f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _AccountSupervisorCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSupervisorCircle: ImageVector? = null
